package devMedia_05_jsf.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;



@ManagedBean(name = "dataBean")
@RequestScoped  /* bean instanciado a cada requisição */
public class DataBean {
	
	public Date data;
	
	String dataFormatada;
	
	
	// getters e setters
	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}
	
	
	public String getDataFormatada() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		if(data != null) {
			return sdf.format(data);
		}
		return "";
	}


	public void setDataFormatada(String dataFormatada) {
		this.dataFormatada = dataFormatada;
	}


	public String printData() {
		return "DataBean [data=" + data + "]";
	}

	public void mostrarMsgMudancaData(SelectEvent event) {
		FacesContext facesContext = 
				FacesContext.getCurrentInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = (Date) event.getObject();
		facesContext.addMessage(
				null, new FacesMessage(
						FacesMessage.SEVERITY_INFO, 
						"Data Selecionada", sdf.format(date)));
	}
	
//	public void onDateSelect(SelectEvent<LocalDate> event) {
//        FacesContext facesContext = FacesContext.getCurrentInstance();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
//        		"Data Selecionada", event.getObject().format(formatter)));
//    }
	
}





























