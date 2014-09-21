package model;


import java.util.Date;

public class Contato {
    
    private String nome;
    private String telefone;
    private Date dataNascimento;
    private String tipoTelefone;
    private String sexo;
    private String categoria;
    private String[] redesSociais;
    private boolean status;
    
    
    public String getNome()
    {
        return nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getTelefone()
    {
        return telefone;
    }
    
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
    
    public Date getDataNascimento()
    {
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String[] getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(String[] redesSociais) {
        this.redesSociais = redesSociais;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
