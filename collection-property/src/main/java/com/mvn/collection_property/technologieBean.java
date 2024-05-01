package com.mvn.collection_property;

import java.util.Properties;
import java.util.Set;

public class technologieBean {
    private Properties studentBatch;

    public technologieBean(Properties studentBatch) {
        this.studentBatch = studentBatch;
    }

    public technologieBean() {
    }

    public void setStudentBatch(Properties studentBatch) {
        this.studentBatch = studentBatch;
    }

    public Properties getStudentBatch() {
        return this.studentBatch;
    }

    public void printBatch() {
    	Set<String> keys = studentBatch.stringPropertyNames();
        for (String key : keys) {
            System.out.println(key + ":" + studentBatch.getProperty(key));
        }
    }
}
