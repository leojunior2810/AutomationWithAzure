package steps_definitions;



import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import pages.PaginaInicialPage;

import static core.BaseTests.getDriver;

public class PaginaInicial  {

    private PaginaInicialPage page;

    public PaginaInicial() {
        page = new PaginaInicialPage();
    }

    @Dado("que eu acesse o site do google")
    public void queEuAcesseOSiteDoGoogle() {
        getDriver();
    }
    @Entao("o acesso foi realizado com sucesso")
    public void oAcessoFoiRealizadoComSucesso() {
        page.inputGoogle();
    }

}
