package objetos.voadores;

public class Aviao implements Voador{

    private String Empresa;
    private boolean Emvoo;

    public Aviao(String empresa, boolean emvoo) {
        Empresa = empresa;
        Emvoo = false;
    }

    @Override
    public double voar() {
        this.Emvoo = true;
        System.out.println("decolando ");
        return 0;
    }

    @Override
    public void planar() {
        System.out.println("Planando");

    }

    @Override
    public boolean pousar() {
        this.Emvoo = false;
        System.out.println("Pouso autorizado para a" + Empresa);
        return true;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }
}
