
public class character {
	private String name = "";
	private String alignment;
	private int armorClass = 10;
	private int armorHP = 5;
	private int dice = 18;
	private boolean characterState = true;

	public int attackThatFool() {
		if (isHit() && getDice() == 20) {
			setArmorHP(getArmorHP() - 2);
		} else if (isHit()) {
			setArmorHP(getArmorHP() - 1);
		}
		return getArmorHP();
	}

	public boolean isAlive() {
		return (getArmorHP() > 0);
	}

	public int getArmorClass() {
		return armorClass;
	}

	public boolean isHit() {
		return (getDice() >= getArmorClass());
	}

	public int getDice() {
		return dice;
	}

	public void setDice(int dice) {
		this.dice = dice;
	}

	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}

	public int getArmorHP() {
		return armorHP;
	}

	public void setArmorHP(int armorHP) {
		this.armorHP = armorHP;
		System.out.println(
				"hello my name is bill Im here writing a "
				+ "very simple MMORG game with my good "
				+ "friends just hangin");
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public character() {
	}

	public character(String s) {
		name = s;
	}

	public character(String s, String a) {
		name = s;
		alignment = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
