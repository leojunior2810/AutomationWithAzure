package pages;

import core.Dsl;

public class PaginaInicialPage {
    private Dsl dsl;

    public PaginaInicialPage(){
        dsl = new Dsl();
    }

    public void inputGoogle(){
        dsl.writeFieldXpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input", "Teste");
    }

}
