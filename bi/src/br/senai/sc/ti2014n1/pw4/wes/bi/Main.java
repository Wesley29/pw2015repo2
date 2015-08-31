package br.senai.sc.ti2014n1.pw4.wes.bi;

import br.senai.sc.ti2014n1.pw4.wes.bi.dao.Dao;

public class Main {

	public static void main(String[] args) {
		conectar();

	}
	private static void conectar(){
		Dao dao = new Dao(){};
		dao.getConnection();
	}
}
