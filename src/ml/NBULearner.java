package ml;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayesUpdateable;
import weka.core.Attribute;
import weka.core.Instance;
import weka.core.Instances;

/**
 * Created with IntelliJ IDEA.
 * User: Rye
 * Date: 4/10/14
 * Time: 3:29 PM
 */
public class NBULearner {

    private Classifier nbu = null;
    private int attrCount = 0;

    public NBULearner(int attrCount) {
        nbu = new NaiveBayesUpdateable();
        this.attrCount = attrCount;
    }

    private void init() {

        Instances trainSet = new Instances();
        nbu.buildClassifier();
    }
}
