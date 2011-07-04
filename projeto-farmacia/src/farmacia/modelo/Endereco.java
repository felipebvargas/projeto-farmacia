

package farmacia.modelo;


public class Endereco {

    private String rua;
    private String cep;
    private String bairro;
    private String cidade;


    public Endereco comRua(String rua) {
        setRua(rua);
        return this;
    }

    public Endereco comCep (String cep) {
        setCep(cep);
        return this;
    }

    public Endereco comBairro (String bairro) {
        setBairro(bairro);
        return this;
    }

    public Endereco comCidade (String cidade) {
        setCidade(cidade);
        return this;
    }



    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "{" + rua + "}";
    }





}
