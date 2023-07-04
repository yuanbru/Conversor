import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorMoneda {

	public static void main(String[] args) {

		// Menú para seleccion de conversión
		Object conversor = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menú",
				JOptionPane.DEFAULT_OPTION, null, new Object[] { "Conversor de moneda", "Conversor de temperatura" },
				"Conversor de moneda");

		// Input para ingresar el valor a convertir
		String valorConvertir = JOptionPane.showInputDialog(null,
				"Ingresa el valor que deseas convertir en el " + conversor
						+ " \n>No se acepta coma (,) para decimales<\nEJ: 24 ó 14.5 ",
				"Input", JOptionPane.QUESTION_MESSAGE);

		
		//While para controlar el ingreso de solo numeros 
		while (!soloNumeros(valorConvertir)) {

			JOptionPane.showMessageDialog(null, "Valor no válido");

			valorConvertir = JOptionPane.showInputDialog(null,
					"Por favor ingresa números para realizar la conversión\n>No se acepta coma (,) para decimales)<\nEJ: 24 ó 14.5   ",
					"ERROR !", JOptionPane.ERROR_MESSAGE);

		}
		
		int resp= JOptionPane.showConfirmDialog(null, "¿Está seguro?");
		
		//Inicialización de variable double para convertir el valor ingresado por el usuario
		double valor = Double.parseDouble(valorConvertir);
		
		//Inicializacion de variable double para realizar la operacion de conversion
		double conversion;
		
		//If para controlar la opcion de conversion elegida
		if (conversor == "Conversor de moneda") {

			Object moneda = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
					"Monedas", JOptionPane.DEFAULT_OPTION, null,
					new Object[] { "De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euros",
							"De Pesos Colombianos a Libras Esterlinas", "De Pesos Colombianos a Yen Japonés",
							"De Pesos Colombianos a Won Surcoreano", "De Dólar a Pesos Colombianos",
							"De Euros a Pesos Colombianos", "De Libras Esterlinas a Pesos Colombianos",
							"De Yen Japonés a Pesos Colombianos", "De Won Surcoreano a Pesos Colombianos" },
					"De Pesos Colombianos a Dólar");

			// Se usa switch para controlar la opcion seleccionada por el usuario

			switch (moneda.toString()) {

			case "De Pesos Colombianos a Dólar":

				conversion = valor * 0.00024;
				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Dólar(es)");

				break;

			case "De Pesos Colombianos a Euros":

				conversion = valor * 0.00022;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Euro(s)");

				break;

			case "De Pesos Colombianos a Libras Esterlinas":

				conversion = valor * 0.00019;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Libra(s) Esterlina(s)");

				break;

			case "De Pesos Colombianos a Yen Japonés":

				conversion = valor * 0.035;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Yen(es) Japonés(es)");

				break;

			case "De Pesos Colombianos a Won Surcoreano":

				conversion = valor * 0.31;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Won(es) Surcoreano(s)");

				break;

			case "De Dólar a Pesos Colombianos":

				conversion = valor * 4157.98;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Pesos Colombianos ");

				break;

			case "De Euros a Pesos Colombianos":

				conversion = valor * 4523.49;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Pesos Colombianos");

				break;

			case "De Libras Esterlinas a Pesos Colombianos":

				conversion = valor * 5285.83;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Pesos Colombianos ");

				break;

			case "De Yen Japonés a Pesos Colombianos":

				conversion = valor * 28.78;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Pesos Colombianos ");

				break;

			case "De Won Surcoreano a Pesos Colombianos":

				conversion = valor * 3.21;

				JOptionPane.showMessageDialog(null, "Tienes $" + redondear(conversion) + " Pesos Colombianos ");

				break;

			}

		} else {

			System.out.println("No es monedas");
		}

	}

	private static boolean soloNumeros(String valor) {

		try {

			Double.parseDouble(valor);
			return true;

		} catch (NumberFormatException e) {

			return false;
		}
	}

	private static String redondear(double valor) {

		DecimalFormat decimalFormat = new DecimalFormat("#,###.##");
		return decimalFormat.format(valor);

	}

}
