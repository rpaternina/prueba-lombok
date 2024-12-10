package com.lombok.service.impl;

import com.lombok.model.PruebaModel;
import com.lombok.repository.PruebaRepository;
import com.lombok.service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PruebaServiceImpl implements PruebaService {

	//Puedes hacerlo de 2 maneras.
	/*Inicio Opcion_1
     @Autowired PruebaRepository pruebaRepository;
	 Fin Opcion_ */

	//La segunda es así:
	//Inicio Opcion_
	private final PruebaRepository pruebaRepository;

	@Autowired
	public PruebaServiceImpl(PruebaRepository pruebaRepository) {
		this.pruebaRepository = pruebaRepository;
	}
	//Fin Opcion_2

	@Override
	public PruebaModel savePrueba(PruebaModel pruebaModel){

		if(pruebaModel == null){
			throw new IllegalArgumentException("PruebaModel no puede ser null");
		}
		try {
			pruebaModel.setFechaRegistro(LocalDateTime.now());
			return pruebaRepository.save(pruebaModel);
		} catch (Exception e) {
			System.err.println("Error en el registro");
			throw new RuntimeException(e);
		}

	}

}
