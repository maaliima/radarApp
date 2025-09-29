// Matheus Lima de Santana 
// RA: 00357187 : IDE NetBeans 8.2

package radar;
import java.util.Scanner;

public class RadarApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radar Rodoviário");
        System.out.print("Digite a frequência do carro (entre 0.5 e 1): ");
        float frequencia = scanner.nextFloat();

        System.out.print("Digite a velocidade máxima permitida na rodovia (km/h): ");
        float velocidadePermitida = scanner.nextFloat();

        Radar radar = new Radar(frequencia, velocidadePermitida);
        float velocidadeCalculada = (float) radar.calcularVelocidade();

        System.out.printf("Velocidade do veículo: %.2f km/h\n", velocidadeCalculada);
        System.out.println(radar.verificarMulta());

        scanner.close();
    }
}