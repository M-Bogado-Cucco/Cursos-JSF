package devMedia_05_jsf.ajax;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.TabChangeEvent;

@ManagedBean(name = "accordionBean")
@RequestScoped
public class AccordionBean {

	public void onTabChange(TabChangeEvent event) {
//		FacesMessage msg = new FacesMessage("Tab modificada", "Tab atual: "
//				+ event.getTab().getId());
		FacesMessage msg = new FacesMessage("Tab modificada");
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
