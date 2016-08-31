/**
 */
package rslingo.rsl.rsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rslingo.rsl.rsl.ForeignKey#getFentity <em>Fentity</em>}</li>
 *   <li>{@link rslingo.rsl.rsl.ForeignKey#getRefTo <em>Ref To</em>}</li>
 * </ul>
 *
 * @see rslingo.rsl.rsl.RslPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Fentity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fentity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fentity</em>' reference.
   * @see #setFentity(Entity)
   * @see rslingo.rsl.rsl.RslPackage#getForeignKey_Fentity()
   * @model
   * @generated
   */
  Entity getFentity();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.ForeignKey#getFentity <em>Fentity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fentity</em>' reference.
   * @see #getFentity()
   * @generated
   */
  void setFentity(Entity value);

  /**
   * Returns the value of the '<em><b>Ref To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref To</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref To</em>' containment reference.
   * @see #setRefTo(RefAttribute)
   * @see rslingo.rsl.rsl.RslPackage#getForeignKey_RefTo()
   * @model containment="true"
   * @generated
   */
  RefAttribute getRefTo();

  /**
   * Sets the value of the '{@link rslingo.rsl.rsl.ForeignKey#getRefTo <em>Ref To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref To</em>' containment reference.
   * @see #getRefTo()
   * @generated
   */
  void setRefTo(RefAttribute value);

} // ForeignKey
