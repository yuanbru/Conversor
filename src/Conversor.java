import javax.swing.*;
import java.text.DecimalFormat;

public class Conversor {

	public static void main(String[] args) {

		boolean ejecutar = true;

		// While para controlar el ingreso de acuerdo al cuadro de dialogo de
		// confirmacion si desea volver a ingresar
		while (ejecutar) {

			// Menú para seleccion de conversión
			Object conversor = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversión", "Menú",
					JOptionPane.DEFAULT_OPTION, null,
					new Object[] { "Conversor de moneda", "Conversor de temperatura", "Conversor de velocidad" },
					"Conversor de moneda");

			// Input para ingresar el valor a convertir
			String valorConvertir = JOptionPane.showInputDialog(null,
					"Ingresa el valor que deseas convertir en el " + conversor
							+ " \n>No se acepta coma (,) para decimales<\nEJ: 24 ó 14.5 ",
					"Input", JOptionPane.QUESTION_MESSAGE);

			// While para controlar el ingreso de solo numeros
			while (!soloNumeros(valorConvertir)) {

				JOptionPane.showMessageDialog(null, "Valor no válido");

				valorConvertir = JOptionPane.showInputDialog(null,
						"Por favor ingresa números para realizar la conversión\n>No se acepta coma (,) para decimales)<\nEJ: 24 ó 14.5   ",
						"ERROR !", JOptionPane.ERROR_MESSAGE);

			} // Fin while(!soloNumeros)

			// Inicialización de variable double para convertir el valor ingresado por el
			// usuario
			double valor = Double.parseDouble(valorConvertir);

			// Inicializacion de variable double para realizar la operacion de conversion
			double conversion;

			// If para controlar la opcion de conversion elegida
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
					JOptionPane.showMessageDialog(null,
							valor + " Peso(s) Colombiano(s) son: $" + redondear(conversion) + " Dólar(es)");

					break;

				case "De Pesos Colombianos a Euros":

					conversion = valor * 0.00022;

					JOptionPane.showMessageDialog(null,
							valor + " Peso(s) Colombiano(s) son: $" + redondear(conversion) + " Euro(s)");

					break;

				case "De Pesos Colombianos a Libras Esterlinas":

					conversion = valor * 0.00019;

					JOptionPane.showMessageDialog(null,
							valor + " Peso(s) Colombiano(s) son: $" + redondear(conversion) + " Libra(s) Esterlina(s)");

					break;

				case "De Pesos Colombianos a Yen Japonés":

					conversion = valor * 0.035;

					JOptionPane.showMessageDialog(null,
							valor + " Peso(s) Colombiano(s) son: $" + redondear(conversion) + " Yen(es) Japonés(es)");

					break;

				case "De Pesos Colombianos a Won Surcoreano":

					conversion = valor * 0.31;

					JOptionPane.showMessageDialog(null,
							valor + " Peso(s) Colombiano(s) son: $" + redondear(conversion) + " Won(es) Surcoreano(s)");

					break;

				case "De Dólar a Pesos Colombianos":

					conversion = valor * 4157.98;

					JOptionPane.showMessageDialog(null,
							valor + " Dólar(es) son: $" + redondear(conversion) + " Pesos Colombianos ");

					break;

				case "De Euros a Pesos Colombianos":

					conversion = valor * 4523.49;

					JOptionPane.showMessageDialog(null,
							valor + " Euro(s) son: $" + redondear(conversion) + " Pesos Colombianos");

					break;

				case "De Libras Esterlinas a Pesos Colombianos":

					conversion = valor * 5285.83;

					JOptionPane.showMessageDialog(null,
							valor + " Libra(s) Esterlina(s) son: $" + redondear(conversion) + " Pesos Colombianos ");

					break;

				case "De Yen Japonés a Pesos Colombianos":

					conversion = valor * 28.78;

					JOptionPane.showMessageDialog(null,
							valor + " Yen(es) Japonés(es) son: $" + redondear(conversion) + " Pesos Colombianos ");

					break;

				case "De Won Surcoreano a Pesos Colombianos":

					conversion = valor * 3.21;

					JOptionPane.showMessageDialog(null,
							valor + " Won(es) Surcoreano(s) son: $" + redondear(conversion) + " Pesos Colombianos ");

					break;

				}

			} else if (conversor == "Conversor de temperatura") {

				Object temperatura = JOptionPane.showInputDialog(null,
						"Elije la escala a la que deseas convertir tu temperatura", "Escala Temperatura",
						JOptionPane.DEFAULT_OPTION, null,
						new Object[] { "De Celsius (°C) a Fahrenheit (°F)", "De Celsius (°C) a Kelvin (K)",
								"De Fahrenheit (°F) a Kelvin (K)", "De Fahrenheit (°F) a Celsius (°C)",
								"De Kelvin (K) a  Celsius (°C)", "De Kelvin (K) a Fahrenheit (°F)" },
						"De Celsius (°C) a Fahrenheit (°F)");

				// Se usa switch para controlar la opcion seleccionada por el usuario

				switch (temperatura.toString()) {

				case "De Celsius (°C) a Fahrenheit (°F)":

					conversion = ((valor * 9) / 5) + 32;
					JOptionPane.showMessageDialog(null, valor + "°C equivalen a: " + redondear(conversion) + "°F");

					break;

				case "De Celsius (°C) a Kelvin (K)":

					conversion = valor + 273.15;

					JOptionPane.showMessageDialog(null, valor + "°C equivalen a: " + redondear(conversion) + " K");

					break;

				case "De Fahrenheit (°F) a Kelvin (K)":

					conversion = (((valor - 32) * 5) / 9) + 273.15;

					JOptionPane.showMessageDialog(null, valor + "°F equivalen a: " + redondear(conversion) + " K");

					break;

				case "De Fahrenheit (°F) a Celsius (°C)":

					conversion = (((valor - 32) * 5) / 9);

					JOptionPane.showMessageDialog(null, valor + "°F equivalen a: " + redondear(conversion) + "°C");

					break;

				case "De Kelvin (K) a  Celsius (°C)":

					conversion = valor - 273.15;

					JOptionPane.showMessageDialog(null, valor + " K equivalen a: " + redondear(conversion) + "°C");

					break;

				case "De Kelvin (K) a Fahrenheit (°F)":

					conversion = (((valor - 273.15) * 9) / 5) + 32;

					JOptionPane.showMessageDialog(null, valor + " K equivalen a: " + redondear(conversion) + "°F");

					break;

				} // Fin del switch controla conversion temperatura

			} else {

				Object velocidad = JOptionPane.showInputDialog(null, "Elije la velocidad a la que deseas convertir",
						"Velocidad", JOptionPane.DEFAULT_OPTION, null,
						new Object[] { "Metro(s) por segundo a kilometro(s) por hora",
								"Metro(s) por segundo a Milla(s) por hora",
								"Kilometro(s) por hora a Metro(s) por segundo",
								"Kilometro(s) por hora a Milla(s) por hora", "Milla(s) por hora a Metro(s) por segundo",
								"Milla(s) por hora a Kilometro(s) por hora" },
						"Metros por segundo a kilometros por hora");

				// Se usa switch para controlar la opcion seleccionada por el usuario

				switch (velocidad.toString()) {

				case "Metro(s) por segundo a kilometro(s) por hora":

					conversion = valor * 3.6;
					JOptionPane.showMessageDialog(null, valor + " m/s equivalen a: " + redondear(conversion) + " km/h");

					break;

				case "Metro(s) por segundo a Milla(s) por hora":

					conversion = valor * 2.237;

					JOptionPane.showMessageDialog(null, valor + " m/s equivalen a: " + redondear(conversion) + " mph");

					break;

				case "Kilometro(s) por hora a Metro(s) por segundo":

					conversion = valor / 3.6;

					JOptionPane.showMessageDialog(null, valor + " km/h equivalen a: " + redondear(conversion) + " m/s");

					break;

				case "Kilometro(s) por hora a Milla(s) por hora:":

					conversion = valor / 1.609;

					JOptionPane.showMessageDialog(null, valor + " km/h equivalen a: " + redondear(conversion) + " mph");

					break;

				case "Milla(s) por hora a Metro(s) por segundo":

					conversion = valor / 2.237;

					JOptionPane.showMessageDialog(null, valor + " mph equivalen a: " + redondear(conversion) + " m/s");

					break;

				case "Milla(s) por hora a Kilometro(s) por hora":

					conversion = valor * 1.609;

					JOptionPane.showMessageDialog(null, valor + " mph equivalen a: " + redondear(conversion) + " km/h");

					break;

				}
			} // Fin del if que controla que conversor elige el usuario

			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");

			if (respuesta == 0) {

				ejecutar = true;

			} else {

				ejecutar = false;
				JOptionPane.showMessageDialog(null, "Programa Finalizado");
			}

		} // Fin while(ejecutar)

	} // Fin main

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
