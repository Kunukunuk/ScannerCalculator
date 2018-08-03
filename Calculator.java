
public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	Number add(String type, String[] operands) {
		Number solution = 0;
		switch(type) {
			case "byte": 
				solution = Byte.parseByte(operands[0]) + Byte.parseByte(operands[1]);
				break;
			case "float":
				solution = Float.parseFloat(operands[0]) + Float.parseFloat(operands[1]);
				break;
			case "int":
				solution = Integer.parseInt(operands[0]) + Integer.parseInt(operands[1]);
				break;
			case "short":
				solution = Short.parseShort(operands[0]) + Short.parseShort(operands[1]);
				break;
			case "long":
				solution = Long.parseLong(operands[0]) + Long.parseLong(operands[1]);
				break;
			case "double":
				solution = Double.parseDouble(operands[0]) + Double.parseDouble(operands[1]);
				break;
				
		}
		return solution;
		
	}
	
	Number subtract(String type, String[] operands) {
		Number solution = 0;
		switch(type) {
			case "byte": 
				solution = Byte.parseByte(operands[0]) - Byte.parseByte(operands[1]);
				break;
			case "float":
				solution = Float.parseFloat(operands[0]) - Float.parseFloat(operands[1]);
				break;
			case "int":
				solution = Integer.parseInt(operands[0]) - Integer.parseInt(operands[1]);
				break;
			case "short":
				solution = Short.parseShort(operands[0]) - Short.parseShort(operands[1]);
				break;
			case "long":
				solution = Long.parseLong(operands[0]) - Long.parseLong(operands[1]);
				break;
			case "double":
				solution = Double.parseDouble(operands[0]) - Double.parseDouble(operands[1]);
				break;
				
		}
		return solution;
		
	}
	
	Number multiply(String type, String[] operands) {
		Number solution = 0;
		switch(type) {
			case "byte": 
				solution = Byte.parseByte(operands[0]) * Byte.parseByte(operands[1]);
				break;
			case "float":
				solution = Float.parseFloat(operands[0]) * Float.parseFloat(operands[1]);
				break;
			case "int":
				solution = Integer.parseInt(operands[0]) * Integer.parseInt(operands[1]);
				break;
			case "short":
				solution = Short.parseShort(operands[0]) * Short.parseShort(operands[1]);
				break;
			case "long":
				solution = Long.parseLong(operands[0]) * Long.parseLong(operands[1]);
				break;
			case "double":
				solution = Double.parseDouble(operands[0]) * Double.parseDouble(operands[1]);
				break;
				
		}
		return solution;
		
	}
	
	Number divide(String type, String[] operands) {
		Number solution = 0;
		switch(type) {
			case "byte": 
				solution = Byte.parseByte(operands[0]) / Byte.parseByte(operands[1]);
				break;
			case "float":
				solution = Float.parseFloat(operands[0]) / Float.parseFloat(operands[1]);
				break;
			case "int":
				solution = Integer.parseInt(operands[0]) / Integer.parseInt(operands[1]);
				break;
			case "short":
				solution = Short.parseShort(operands[0]) / Short.parseShort(operands[1]);
				break;
			case "long":
				solution = Long.parseLong(operands[0]) / Long.parseLong(operands[1]);
				break;
			case "double":
				solution = Double.parseDouble(operands[0]) / Double.parseDouble(operands[1]);
				break;
				
		}
		return solution;
		
	}

}
