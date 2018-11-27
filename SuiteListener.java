package ru.raiffeisen.mikhaylova;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class SuiteListener implements ISuiteListener {

    @Override
    public void onStart(ISuite iSuite) {
        System.out.println("Suite: " + iSuite.getName());
    }

    @Override
    public void onFinish(ISuite iSuite) {
    }
}
