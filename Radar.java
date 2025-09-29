// Matheus Lima de Santana 
// RA: 00357187 : IDE NetBeans

package radar;

public class Radar {
    private float frequenciaCarro;
    private float velocidadePermitida;

    public Radar(float frequenciaCarro, float velocidadePermitida) {
        this.frequenciaCarro = frequenciaCarro;
        this.velocidadePermitida = velocidadePermitida;
    }

    public float calcularVelocidade() {
        return ((1f / getFrequenciaCarro()) - 1f) * 300f;
    }

    public String verificarMulta() {
        float velocidade = calcularVelocidade();
        float limite20 = getVelocidadePermitida() * 1.2f;
        float limite50 = getVelocidadePermitida() * 1.5f;

        if (velocidade <= getVelocidadePermitida()) {
            return "Velocidade dentro do limite. Sem multa.";
        } else if (velocidade <= limite20) {
            return "Infração Média: R$ 130,16 - 4 Pontos na CNH";
        } else if (velocidade <= limite50) {
            return "Infração Grave: R$ 195,23 - 5 Pontos na CNH";
        } else {
            return "Infração Gravíssima: R$ 880,41 - 7 Pontos na CNH";
        }
    }

    public float getFrequenciaCarro() {
        return frequenciaCarro;
    }

    public void setFrequenciaCarro(float frequenciaCarro) {
        this.frequenciaCarro = frequenciaCarro;
    }

    public float getVelocidadePermitida() {
        return velocidadePermitida;
    }

    public void setVelocidadePermitida(float velocidadePermitida) {
        this.velocidadePermitida = velocidadePermitida;
    }
}

