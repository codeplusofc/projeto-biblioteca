package projbibliotecanoite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {

    private double valorLocacao;
    private double valorMulta;
    private Funcionario objFuncionario;
    private Usuario objUsuario;
    private Livro objLivro;
    private Data dataLocacao;
    private Data dataDevolucao;
    private Livro objLivroLocado;

    public Locacao() {
        this.objFuncionario = new Funcionario();
        this.objUsuario = new Usuario();
        this.objLivro = new Livro();
        this.dataLocacao = new Data();
        this.dataDevolucao = new Data();
        this.objLivroLocado = new Livro();
    }

    public Livro getObjLivroLocado() {
        return objLivroLocado;
    }

    public void setObjLivroLocado(Livro objLivroLocado) {
        this.objLivroLocado = objLivroLocado;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Funcionario getObjFuncionario() {
        return objFuncionario;
    }

    public void setObjFuncionario(Funcionario objFuncionario) {
        this.objFuncionario = objFuncionario;
    }

    public Usuario getObjUsuario() {
        return objUsuario;
    }

    public void setObjUsuario(Usuario objUsuario) {
        this.objUsuario = objUsuario;
    }

    public Livro getObjLivro() {
        return objLivro;
    }

    public void setObjLivro(Livro objLivro) {
        this.objLivro = objLivro;
    }

    public Data getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Data dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Data getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Data dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double calcularLocacao() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy");

        Date dLocacao = df.parse(this.dataLocacao.toString());
        Date dDevolucao = df.parse(this.dataLocacao.toString());

        long dias = (dDevolucao.getTime() - dLocacao.getTime()) / 86400000;

        if (dias <= 7) {
            return this.valorLocacao;
        }
        return (dias - 7) * this.valorMulta + this.valorLocacao;

    }

    public void locarLivro() {
        this.objLivro.status = true;
    }

    public void devolverLivro() {
        this.objLivro.status = false;
    }

    @Override
    public String toString() {
        return "\n"
                + "Valor da locação: " + valorLocacao + "\n"
                + "Valor da multa: " + valorMulta + "\n"
                + "\nFuncionario=" + objFuncionario + ", objUsuario=" + objUsuario + ", objLivro=" + objLivro + ", dataLocacao=" + dataLocacao + ", dataDevolucao=" + dataDevolucao + '}';
    }

}
