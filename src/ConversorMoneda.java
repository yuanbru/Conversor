import javax.swing.*;

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

		while (!soloNumeros(valorConvertir)) {

			JOptionPane.showMessageDialog(null, "Valor no válido");

			valorConvertir = JOptionPane.showInputDialog(null,
					"Por favor ingresa números para realizar la conversión\n>No se acepta coma (,) para decimales)<\nEJ: 24 ó 14.5   ",
					"ERROR !", JOptionPane.ERROR_MESSAGE);

		}

		if (conversor == "Conversor de moneda") {
			Object moneda = JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
					"Monedas", JOptionPane.DEFAULT_OPTION, null,
					new Object[] { "De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euros",
							"De Pesos Colombianos a Libras Esterlinas", "De Pesos Colombianos a Yen Japonés",
							"De Pesos Colombianos a Won Surcoreano", "De Dólar a Pesos Colombianos",
							"De Euros a Pesos Colombianos", "De Libras Esterlinas a Pesos Colombianos",
							"De Yen Japonés a Pesos Colombianos", "De Won Surcoreano a Pesos Colombianos" },
					"De Pesos Colombianos a Dólar");

			// USAR SWITCH CASE PARA HACER LAS CONVERSIONES DE MONEDAS

			switch (moneda.toString()) {

			case "De Pesos Colombianos a Dólar":

				double pesoDolar = redondear(Double.parseDouble(valorConvertir) * 0.00024);

				JOptionPane.showMessageDialog(null, "Tienes $" + pesoDolar + " Dólar(es)");

				break;

			case "De Pesos Colombianos a Euros":

				double pesoEuro = redondear(Double.parseDouble(valorConvertir) *1);

				JOptionPane.showMessageDialog(null, "Tienes $" + pesoEuro + " Euro(s)");

				break;

			case "De Pesos Colombianos a Libras Esterlinas":

				double pesoLibra = redondear(Double.parseDouble(valorConvertir) * 2);

				JOptionPane.showMessageDialog(null, "Tienes $" + pesoLibra + " Libra(s) Esterlina(s)");

				break;

			case "De Pesos Colombianos a Yen Japonés":

				double pesoYen = redondear(Double.parseDouble(valorConvertir) *3 );

				JOptionPane.showMessageDialog(null, "Tienes $" + pesoYen + " Yen(es) Japonés(es)");

				break;

			case "De Pesos Colombianos a Won Surcoreano":

				double pesoWon = redondear(Double.parseDouble(valorConvertir) *4 );

				JOptionPane.showMessageDialog(null, "Tienes $" + pesoWon + " Won(es) Surcoreano(s)");

				break;

			case "De Dólar a Pesos Colombianos":

				double dolarPeso = redondear(Double.parseDouble(valorConvertir) * 5);

				JOptionPane.showMessageDialog(null, "Tienes $" + dolarPeso + " Pesos Colombianos ");

				break;
			case "De Euros a Pesos Colombianos":

				double euroPeso = redondear(Double.parseDouble(valorConvertir) * 0.00024);

				JOptionPane.showMessageDialog(null, "Tienes $" + euroPeso + " Pesos Colombianos ");

				break;

			case "De Libras Esterlinas a Pesos Colombianos":

				double libraPeso = redondear(Double.parseDouble(valorConvertir) * 0.00024);

				JOptionPane.showMessageDialog(null, "Tienes $" + libraPeso + " Pesos Colombianos ");

				break;
			case "De Yen Japonés a Pesos Colombianos":

				double yenPeso = redondear(Double.parseDouble(valorConvertir) * 0.00024);

				JOptionPane.showMessageDialog(null, "Tienes $" + yenPeso + " Pesos Colombianos ");

				break;
			case "De Won Surcoreano a Pesos Colombianos":

				double wonPeso = redondear(Double.parseDouble(valorConvertir) * 0.00024);

				JOptionPane.showMessageDialog(null, "Tienes $" + wonPeso + " Pesos Colombianos ");

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

	private static double redondear(double moneda) {

		return Math.round(moneda * 100.0) / 100.0;

	}

}
