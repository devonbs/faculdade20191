package com.devon.faculdade.algoritimos.exe53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrdenacaoMergeSortTest {

	Integer[] novaLista = {70,2,88,15,90,30};
	
	@Test
	void testOrdenar() {
		OrdenacaoMergeSort<Integer> merge = new OrdenacaoMergeSort<Integer>();
		merge.setInfo(novaLista);
		merge.ordenar();
		assertEquals("{70,2,88,15,90,30}", merge.toString());
	}

}
