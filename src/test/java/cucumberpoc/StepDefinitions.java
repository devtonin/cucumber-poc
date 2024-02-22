package cucumberpoc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.cucumber.java.en.*;

class OPalmeiras {
    static String temMundial(String respostaCerta) {
        return "Lógico!";
    }
}

public class StepDefinitions {

    private String respostaCerta;
    private String respostaAtual;

    @Given("o mundial contra o Juventus ser valido")
    public void o_mundial_contra_o_juventus_ser_valido() {
        respostaCerta = "Lógico!";
    }
    @When("Eu perguntar se o palmeiras tem mundial")
    public void eu_perguntar_se_o_palmeiras_tem_mundial() {
        respostaAtual = OPalmeiras.temMundial(respostaCerta);
    }
    @Then("O resposta seria {string}")
    public void o_resposta_seria(String respostaFinal) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(respostaFinal, respostaAtual);
    }
}