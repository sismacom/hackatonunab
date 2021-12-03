package com.ejemplo.tiendaalamano.service.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Usuario;
import com.ejemplo.tiendaalamano.repository.IUsuarioRepository;
import com.ejemplo.tiendaalamano.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	@Autowired
	private IUsuarioRepository UsuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return UsuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Long id) {
		return UsuarioRepository.findById(id);
	}

	@Override
	@Transactional
	public Usuario save(Usuario Usuario) {
		return UsuarioRepository.save(Usuario);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		UsuarioRepository.deleteById(id);
	}

	@Override
	public List<Usuario> login(String username, String password) {
		List<Usuario> Usuarios = UsuarioRepository.login(username, password);
		return Usuarios;
	}

}
