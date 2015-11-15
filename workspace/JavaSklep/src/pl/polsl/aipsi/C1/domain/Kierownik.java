/**
 * 
 */
package pl.polsl.aipsi.C1.domain;

import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author Administrator
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Kierownik implements Uzytkownik {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private Set<Zapytanie> zapytanieofertowe;

	/** 
	 * @return the zapytanieofertowe
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public Set<Zapytanie> getZapytanieofertowe() {
		// begin-user-code
		return zapytanieofertowe;
		// end-user-code
	}

	/** 
	 * @param zapytanieofertowe the zapytanieofertowe to set
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void setZapytanieofertowe(Set<Zapytanie> zapytanieofertowe) {
		// begin-user-code
		this.zapytanieofertowe = zapytanieofertowe;
		// end-user-code
	}
}