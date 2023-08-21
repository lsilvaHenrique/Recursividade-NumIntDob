package main;

public class Principal {

	 // Função recursiva para contar quantas vezes o dígito aparece no número
    private static int IntDob(int number, int digit) {
        // Condição de parada: quando o número é 0
        if (number == 0) {
            return 0;
        }

        // Se o último dígito do número é igual ao dígito fornecido
        int lastDigit = number % 10;
        int count = (lastDigit == digit) ? 1 : 0;

        // Relação de chamada dos passos: chamar a função recursiva com o número sem o último dígito
        return count + IntDob(number / 10, digit);
    }  
}
