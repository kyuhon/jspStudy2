package com.kh.dev.student.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.dev.student.control.ActionForward;
import com.kh.dev.student.model.StudentDAO;
import com.kh.dev.student.model.StudentVO;

public class ModifyFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		 StudentDAO dao = StudentDAO.getInstance(); 
		 HttpSession session = request.getSession();
		 String id = (String)session.getAttribute("id");
		 StudentVO vo = new StudentVO();
		 vo.setId(id);
		 StudentVO svo = dao.selectOneDB(vo);
		 request.setAttribute("svo", svo);
		
		 return new ActionForward("/mvcmem/modifyForm.jsp",false);
	}

}
