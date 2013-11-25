/*
 jTicketing is a highly configurable solution for the management of online booking, electronic ticket and box office.

 Copyright (C) 2010-2012 OpenPRJ s.r.l.
 All rights reserved

 Site: http://www.openprj.it
 Contact:  info@openprj.it
 */

package it.openprj.jTicketing.backend.actions;

import it.openprj.jTicketing.blogic.model.entity.ReportisticaLuoghiInteresse;
import it.openprj.jTicketing.blogic.model.entity.User;
import it.openprj.jTicketing.blogic.services.factory.ServicesFactory;
import it.openprj.jTicketing.blogic.services.manager.BackEndMgr;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

public class ProcessReportisticaAdminStep1Action extends DispatchAction {

	public ActionForward get(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		try {
			session.getAttribute("session").toString();
		} catch (Exception e) {
			session.setAttribute("session", "active");
			return mapping.findForward("home");
		}
		
		User user = (User) session.getAttribute("user");
		if (user == null || user.isAdministrator() == false) {
			return mapping.findForward("home");
		}
		
		ArrayList<ReportisticaLuoghiInteresse> listaReportisticaLuoghiInteresse;
		BackEndMgr service = ServicesFactory.getInstance().getBackEndMgrMgr();
		listaReportisticaLuoghiInteresse = (ArrayList<ReportisticaLuoghiInteresse>) service.reportisticaLuoghiInteresseAdmin();
		session.setAttribute("listaReportisticaLuoghiInteresse", listaReportisticaLuoghiInteresse);
			
		return mapping.findForward("success");
	}
}