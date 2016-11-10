package org.neuroph.netbeans.classificationsample;

import java.util.Collection;
import java.util.logging.Logger;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.*;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.neuroph.netbeans.classificationsample//Settings//EN",
        autostore = false)
@TopComponent.Description(
        preferredID = "MlpClassificationSampleControlsTopComponent",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS)
@TopComponent.Registration(mode = "properties", openAtStartup = false)
@ActionID(category = "Window", id = "org.neuroph.netbeans.classificationsample.MlpClassificationSampleControlsTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_SettingsAction",
        preferredID = "MlpClassificationSampleControlsTopComponent")
@Messages({
    "CTL_SettingsAction=Classification Sample Controls",
    "CTL_SettingsTopComponent=Classification Sample Controls",
    "HINT_SettingsTopComponent=Multi Layer Perceptron Classification Sample Controls"
})
// TODO: da slusa listenerom visualization tc na koji je povezan
public final class MlpClassificationSampleControlsTopComponent extends TopComponent implements LookupListener {

    MultiLayerPerceptronVisualizationTopComponent currentMlpVisualizationTc;
    Lookup.Result lookupResult;
    
    private MlpClassificationSampleControlsTopComponent() {
        initComponents();
        setName(Bundle.CTL_SettingsTopComponent());
        setToolTipText(Bundle.HINT_SettingsTopComponent());
        putClientProperty(TopComponent.PROP_KEEP_PREFERRED_SIZE_WHEN_SLIDED_IN, Boolean.TRUE);                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sampleControlsPanel = new org.neuroph.netbeans.classificationsample.MultiLayerPerceptronClassificationSamplePanel();

        setLayout(new java.awt.GridLayout(1, 0));
        add(sampleControlsPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.neuroph.netbeans.classificationsample.MultiLayerPerceptronClassificationSamplePanel sampleControlsPanel;
    // End of variables declaration//GEN-END:variables
    
    private static MlpClassificationSampleControlsTopComponent instance;
    private static final String PREFERRED_ID = "MlpClassificationSampleControlsTopComponent";
    
    /**
     * Gets default instance. Do not use directly: reserved for *.settings files only,
     * i.e. deserialization routines; otherwise you could get a non-deserialized instance.
     * To obtain the singleton instance, use {@link #findInstance}.
     */
    private static synchronized MlpClassificationSampleControlsTopComponent getDefault() {
        if (instance == null) {
            instance = new MlpClassificationSampleControlsTopComponent();
        }
        return instance;
    }
    
    /**
     * Obtain the MultiLayerPerceptronClassificationSampleTopComponent instance. Never call {@link #getDefault} directly!
     */
    public static synchronized MlpClassificationSampleControlsTopComponent findInstance() {
        TopComponent win = WindowManager.getDefault().findTopComponent(PREFERRED_ID);// finds top component
        if (win == null) {
            Logger.getLogger(MlpClassificationSampleControlsTopComponent.class.getName()).warning(
                    "Cannot find " + PREFERRED_ID + " component. It will not be located properly in the window system.");
            return getDefault();//if it cannot find the top component, it creates a new instance(Singleton patern)
        }
        if (win instanceof MlpClassificationSampleControlsTopComponent) {
            return (MlpClassificationSampleControlsTopComponent) win;
        }
        Logger.getLogger(MlpClassificationSampleControlsTopComponent.class.getName()).warning(
                "There seem to be multiple components with the '" + PREFERRED_ID
                + "' ID. That is a potential source of errors and unexpected behavior.");
        return getDefault();
    }
    
    //getter for the sampleControlsPanel
    public MultiLayerPerceptronClassificationSamplePanel getSampleControlsPanel() {
        return sampleControlsPanel;
    }
  
    @Override
    public void componentOpened() {
        lookupResult =  Utilities.actionsGlobalContext().lookupResult(MultiLayerPerceptronVisualizationTopComponent.class); // MultiLayerPerceptronVisualizationTopComponent
        lookupResult.addLookupListener(this);
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

    @Override
    public void resultChanged(LookupEvent le) {
        // listen for visualization tc in global lookup
         Collection<? extends Object> mlpTcCollection = ((Lookup.Result)le.getSource()).allInstances();
         if (!mlpTcCollection.isEmpty()) {
            currentMlpVisualizationTc = (MultiLayerPerceptronVisualizationTopComponent) mlpTcCollection.iterator().next();
            sampleControlsPanel.setMlpSampleTc(currentMlpVisualizationTc);
            currentMlpVisualizationTc.setSampleControllsTC(this);
        }
    }

  
}
