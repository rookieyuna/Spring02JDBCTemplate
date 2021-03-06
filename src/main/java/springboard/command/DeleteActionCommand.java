package springboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import springboard.model.JDBCTemplateDAO;

public class DeleteActionCommand implements BbsCommandImpl {
	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest req = (HttpServletRequest)map.get("req");
		
		String idx = req.getParameter("idx");
		String pass = req.getParameter("pass");
		
		JDBCTemplateDAO dao = new JDBCTemplateDAO();
		
		dao.delete(idx, pass);
	}
}
