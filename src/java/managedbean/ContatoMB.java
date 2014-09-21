package managedbean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import model.Contato;

import model.Contato;

@ManagedBean
public class ContatoMB {
    
    private Contato contato = new Contato();
    
    public String adicionarContato()
    {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        String msg = "Contato adicionado: " + contato.getNome() + " - " + 
                contato.getTelefone() + " - " + contato.getTipoTelefone() + " - " +
                df.format(contato.getDataNascimento());
        FacesMessage fm = new FacesMessage(msg);
        FacesContext.getCurrentInstance().addMessage("msg", fm);
        
        return "index";
    }
    
    public Contato getContato()
    {
        return contato;
    }
    
    public void setContato(Contato contato)
    {
        this.contato = contato;
    }
    
    
}
