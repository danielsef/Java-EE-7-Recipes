
package org.javaeerecipes.chapter19.recipe19_07;

/**
 *
 * @author Juneau
 */
public class WidgetOutputItem {
    private String lineText;
    
    public WidgetOutputItem(String line){
        this.lineText = line;
    }

    /**
     * @return the lineText
     */
    public String getLineText() {
        return lineText;
    }

    /**
     * @param lineText the lineText to set
     */
    public void setLineText(String lineText) {
        this.lineText = lineText;
    }
}
