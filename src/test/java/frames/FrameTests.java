package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testFrameText() {
        var nestedFramesPage = homePage.clickFramesPage().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello";
        String text2 = "world";

        editorPage.SetTextArea(text1);
        editorPage.decreaseIndention();
        editorPage.SetTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");
    }
}
