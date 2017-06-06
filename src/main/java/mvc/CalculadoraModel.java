package mvc;

public class CalculadoraModel {
	
	private float peso = 0;
	private float altura = 0;
	private String sexo = "";
	private String msg = "";	
	private double result = 0;	

	
	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getMsg() {
		return msg;
	}



	public void setMsg(String msg) {
		this.msg = msg;
	}



	public double getResult() {
		return result;
	}



	public void setResult(double result) {
		this.result = result;
	}


	public String calculaIMC(Float peso, Float altura, String sexo){		
		
		
		result = peso / (Math.pow(altura, 2));
		
		if (sexo.toUpperCase().equals("F")) {
			if (result < 19.1) {
				msg = "Abaixo do Peso";
			} else if (result >= 19.1 && result <= 25.8) {
				msg = "Peso Ideal";
			} else if (result >= 25.9 && result <= 27.3) {
				msg = "Pouco Acima do Peso";
			} else if (result >= 27.4 && result <= 32.3) {
				msg = "Acima do Peso";
			} else if (result >= 32.4) {
				msg = "Obesidade";
			}
	
		} else if (sexo.toUpperCase().equals("M")) {
			if (result < 20.7) {
				msg = "Abaixo do Peso";
			} else if (result >= 20.7 && result <= 26.4) {
				msg = "Peso Ideal";
			} else if (result >= 26.5 && result <= 27.8) {
				msg = "Pouco Acima do Peso";
			} else if (result >= 27.9 && result <= 31.1) {
				msg = "Acima do Peso";
			} else if (result >= 31.2) {
				msg = "Obesidade";
			}
		}
		return msg;								
		}
}