package rbru.quickstart001;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class MySuiteListener implements ISuiteListener {
    @Override
    public void onStart(ISuite iSuite) {
        //System.out.println("Start suite: " + iSuite.getName());

    }

    @Override
    public void onFinish(ISuite iSuite) {

        //System.out.println("Finish Init suite: " + iSuite.getName());

    }
}
