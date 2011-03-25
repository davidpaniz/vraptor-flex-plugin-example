/***
 * Copyright (c) 2009 Caelum - www.caelum.com.br/opensource
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.com.caelum.vraptor.blank;

import java.util.Arrays;
import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.model.Aluno;

@Resource
public class HelloController {

	public HelloController() {
	}

	public String test() {
		return "Uhu";
	}

	public Aluno test2() {
		return createAluno(2l, "David Paniz");
	}

	public List<Aluno> test3() {
		return Arrays.asList(createAluno(2l, "David Paniz"),
				createAluno(1, "Erich Egert"),
				createAluno(3, "Lucas Cavalcanti"));
	}

	private Aluno createAluno(long id, String nome) {
		Aluno aluno1 = new Aluno();
		aluno1.setId(id);
		aluno1.setNome(nome);
		return aluno1;
	}
}
