package org.phyi.render;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.phyi.render.excel.ExcelRender;
import org.phyi.render.excel.ExcelSheet;

import java.io.File;
import java.util.List;

/**
 * ExcelRenderTest
 *
 * @author czhouyi@gmail.com
 */
public class ExcelRenderTest {

    @Test
    public void testRender() throws Exception {
        ExcelRender render = new ExcelRender("C:\\Users\\gaoxiong\\Desktop\\测试123.xlsx");
        List<ExcelSheet> excelSheets = render.render();
        for (int i = 0; i < excelSheets.size(); i++) {
            ExcelSheet excelSheet = excelSheets.get(i);
            FileUtils.writeStringToFile(new File("C:\\Users\\gaoxiong\\Desktop\\exportExcel_" + i + ".html"), excelSheet.toString(), "utf-8");
        }
    }
}
