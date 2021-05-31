package pregunta2;

public class Cliente {
	public static void main(String[] args) {
		ConcreteCelular proto = new ConcreteCelular();
		proto.setModelo("A1");
		proto.setPeso("60");
		proto.setImei("");
		proto.setPais("Bolivia");
		proto.setCamara(new Camara("10","5MP"));
		
		
		ConcreteCelular cel1 = (ConcreteCelular) proto.clone();
		cel1.setImei("1001");
		
		ConcreteCelular cel2 = (ConcreteCelular) proto.clone();
		cel2.setImei("1002");
		
		ConcreteCelular cel3 = (ConcreteCelular) proto.clone();
		cel3.setImei("1003");
		
		ConcreteCelular cel4 = (ConcreteCelular) proto.clone();
		cel4.setImei("1004");
		
		ConcreteCelular cel5 = (ConcreteCelular) proto.clone();
		cel5.setImei("1005");

	}

}
