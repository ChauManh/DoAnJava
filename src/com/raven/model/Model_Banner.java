
package com.raven.model;

import javax.swing.Icon;

public class Model_Banner {
    Icon icon;
    String name;
    String feedback;
    String type;

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Model_Banner()
    {
        
    }

    public Model_Banner(Icon icon, String name, String feedback, String type) {
        this.icon = icon;
        this.name = name;
        this.feedback = feedback;
        this.type = type;
    }
    
    
}
