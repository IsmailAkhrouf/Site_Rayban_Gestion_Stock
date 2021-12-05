package util;


import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

public class LoggedInCheck implements PhaseListener {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }

    public void beforePhase(PhaseEvent event) {
    }

    public void afterPhase(PhaseEvent event) {
        FacesContext fc = event.getFacesContext();
        boolean loginPage = fc.getViewRoot().getViewId().lastIndexOf("login") > -1 ? true : false;
        HttpSession session = (HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
        String isLog = (String)session.getAttribute("valid_user");
        if (loginPage && isLog != null) {
        	fc.getViewRoot().setViewId("/index.jsp");
        	return;
        }
        else if (!loginPage && isLog == null) {
        	fc.getViewRoot().setViewId("/login.jsp");
        	return;
        }
    }
}