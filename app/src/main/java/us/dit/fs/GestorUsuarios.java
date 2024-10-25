package us.dit.fs;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Clase que gestiona un mapa de claves String y valores de tipo Usuario.
 */
public class GestorUsuarios {

	// Mapa para almacenar las claves y sus valores asociados de tipo Usuario
	private Map<String, Usuario> mapa;

	/**
	 * Constructor que inicializa el mapa.
	 */
	public GestorUsuarios() {
		mapa = new HashMap<>();
	}

	/**
	 * Método para agregar un nuevo usuario al mapa.
	 *
	 * @param clave   la clave de tipo String.
	 * @param usuario el valor de tipo Usuario asociado a la clave.
	 */
	public void agregarUsuario(String clave, Usuario usuario) {
		mapa.put(clave, usuario);
	}

	/**
	 * Método para obtener el valor (Usuario) asociado a una clave.
	 *
	 * @param clave la clave de tipo String.
	 * @return el valor de tipo Usuario asociado a la clave, o null si no existe la
	 *         clave.
	 */
	public Usuario obtenerUsuario(String clave) {
		return mapa.get(clave);
	}

	/**
	 * Método para eliminar un usuario del mapa por su clave.
	 *
	 * @param clave la clave de tipo String a eliminar.
	 * @return el valor de tipo Usuario que estaba asociado a la clave, o null si no
	 *         existe.
	 */
	public Usuario eliminarUsuario(String clave) {
		return mapa.remove(clave);
	}

	/**
	 * Método para obtener el tamaño del mapa.
	 *
	 * @return el número de entradas en el mapa.
	 */
	public int obtenerTamano() {
		return mapa.size();
	}

	/**
	 * Método para encontrar al usuario más joven, es decir, aquel cuya fecha de
	 * nacimiento es la más reciente.
	 *
	 * @return el usuario más joven, o null si el mapa está vacío.
	 */
	public Usuario obtenerUsuarioMasJoven() {
		Optional<Usuario> usuarioMasJoven = mapa.values().stream()
				.min((u1, u2) -> u2.getFechaNacimiento().compareTo(u1.getFechaNacimiento())); // Comparación invertida
																								// para encontrar la
																								// fecha más reciente

		return usuarioMasJoven.orElse(null);
	}

	/**
	 * Método para encontrar al usuario más mayor, es decir, aquel cuya fecha de
	 * nacimiento es la más antigua.
	 *
	 * @return el usuario más mayor, o null si el mapa está vacío.
	 */
	public Usuario obtenerUsuarioMasMayor() {
		Optional<Usuario> usuarioMasMayor = mapa.values().stream()
				.min((u1, u2) -> u1.getFechaNacimiento().compareTo(u2.getFechaNacimiento())); // Comparación normal para
																								// encontrar la fecha
																								// más antigua

		return usuarioMasMayor.orElse(null);
	}
}
