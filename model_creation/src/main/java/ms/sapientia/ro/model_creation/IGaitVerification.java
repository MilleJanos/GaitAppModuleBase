package ms.sapientia.ro.model_creation;



import ms.sapientia.ro.feature_extraction.Accelerometer;
import weka.classifiers.Classifier;
import weka.core.Attribute;

import java.util.ArrayList;

public interface IGaitVerification {
    public double verifyUser(Classifier classifier, ArrayList<Attribute> attributes, ArrayList<Accelerometer> rawdata, String userName);
    public double verifyUser( Classifier classifier, ArrayList<Attribute> attributes, String rawdata_file);
}
