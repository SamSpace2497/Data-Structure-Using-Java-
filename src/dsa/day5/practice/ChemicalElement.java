package dsa.day5.practice;

import java.util.Objects;

public class ChemicalElement implements Comparable<ChemicalElement>
{
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	ChemicalElement left,right;
	
	
	
	public ChemicalElement() {
		super();
	}
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
	
	//97 66 99   97 98 67
	//a  B  c    a  b  C
	
//	
	/*public int compareTo(ChemicalElement o) 
	 * {
		System.out.println("Comparing "+atomicNumber+" with "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}*/
	
	@Override
	public int hashCode() {
		return Objects.hash(atomicFormula, atomicName, atomicNumber, atomicWeight, left, right);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChemicalElement other = (ChemicalElement) obj;
		return Objects.equals(atomicFormula, other.atomicFormula) && Objects.equals(atomicName, other.atomicName)
				&& atomicNumber == other.atomicNumber
				&& Float.floatToIntBits(atomicWeight) == Float.floatToIntBits(other.atomicWeight)
				&& Objects.equals(left, other.left) && Objects.equals(right, other.right);
	}
	public int compareTo(ChemicalElement o) 
	{
		System.out.println("comparing "+atomicName+" with "+o.atomicName);
		System.out.println(atomicName.compareTo(o.atomicName));
		return atomicName.compareTo(o.atomicName);
	}
}

