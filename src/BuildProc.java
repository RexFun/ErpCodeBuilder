import model.proc.ExportFile;
import model.proc.PageQueryJson;
import model.proc.ProcJson;
import model.proc.ProcQueryJson;
import model.proc.ProcUpFile;
import engine.FreeMarkerEngine;

public class BuildProc {
	static String TEMP_PATH = "E:/projs/ErpCodeBuilder/bin/template/proc";
	
	public static void main(String[] args){
//		Demo demo = new Demo();
//		demo.setName("测试");
//		demo.setParams("param1", "p1");
//		demo.setParams("param2", "p2");
//		demo.setParams("param3", "p3");
//		demo.addListObj("l1");
//		demo.addListObj("l2");
//		demo.addListObj("l3");
//	    FreeMarkerEngine.buildDemo(demo, TEMP_PATH);
		
//		增、删、改
//		ProcJson model = new ProcJson();
//		model.setProcName("demo_del");
//		model.setDevUserName("jun");
//		model.setDevDate("20150907");
//		model.setProcMsg("demo演示_删除");
//		model.putFormParamsArrayObj("rowid", "array_varchar2_50");
//		FreeMarkerEngine.buildProcJson(model,TEMP_PATH);
	
//		翻页查询
//		PageQueryJson model = new PageQueryJson();
//		model.setProcName("demo_query");
//		model.setDevUserName("jun");
//		model.setDevDate("20150907");
//		model.setProcMsg("demo演示_翻页查询");
//		model.putFormParamsObj("tcRowid", "number(18)");
//		model.putFormParamsObj("tcCode", "varchar2(60)");
//		model.putFormParamsObj("tcName", "varchar2(100)");
//		FreeMarkerEngine.buildPageQueryJson(model,TEMP_PATH);
		
//		非翻页查询
//		ProcQueryJson model = new ProcQueryJson();
//		model.setProcName("demo_query");
//		model.setDevUserName("jun");
//		model.setDevDate("20150901");
//		model.setProcMsg("demo演示_非翻页查询");
//		model.putFormParamsObj("tcRowid", "number(18)");
//		model.putFormParamsObj("tcCode", "varchar2(100)");
//		FreeMarkerEngine.buildProcQueryJson(model,TEMP_PATH);
		
//		导出
//		ExportFile model = new ExportFile();
//		model.setProcName("demo");
//		model.setDevUserName("jun");
//		model.setDevDate("20150907");
//		model.setProcMsg("demo演示_导出");
////		model.setStorePermission(true);
////		model.setPluPermission(true);
//		FreeMarkerEngine.buildExportFile(model,TEMP_PATH);
		
//		导入
//		ProcUpFile model = new ProcUpFile();
//		model.setProcName("demo");
//		model.setDevUserName("jun");
//		model.setDevDate("20150907");
//		model.setProcMsg("demo演示_导入");
////		model.setStorePermission(true);
////		model.setPluPermission(true);
//		FreeMarkerEngine.buildProcUpFile(model,TEMP_PATH);

		ProcUpFile model = new ProcUpFile();
		model.setProcName("demoBase13");
		model.setDevUserName("jun");
		model.setDevDate("20150925");
		model.setProcMsg("demoBase13演示_导入");
		model.putFormParamsObj("tcHdRowid", "number(18)");
		FreeMarkerEngine.buildProcUpFile(model,TEMP_PATH);
	}
}
