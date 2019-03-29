package ms.sapientia.ro.millejanosproba1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import ms.sapientia.ro.model_creation.GaitModelBuilder;
import ms.sapientia.ro.model_creation.IGaitModelBuilder;
import weka.classifiers.Classifier;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IGaitModelBuilder builder = new GaitModelBuilder();
        //System.out.println(R.id);
        InputStream is = getResources().openRawResource(R.raw.am_dummy);
        /*BufferedReader br = new BufferedReader( new InputStreamReader( is ));
        String line = null;
        int counter = 0;
        try {
            while (( line = br.readLine()) != null) {
                ++counter;
            }
        }catch( Exception e){
            e.printStackTrace();
        }
        System.out.println("Counter: "+counter);
        */

        Classifier classifier = builder.createModel( is );
        System.out.println("RESULT: "+classifier.toString());
    }
}
