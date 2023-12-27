package med.voll.api.endereco;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.medico.Especialidade;

public record DadosCadastroMedico( 
		@NotBlank String nome, 
		@NotBlank 
		@Email String email,
		@Pattern(regexp = "\\d{4,6}")
		String crm, 
		@Pattern(regexp = "\\d{10,17}")
		String telefone,
		@NotNull
		Especialidade especialidade, 
		@NotNull
		@Valid
		DadosEndereco endereco) {

	
	
	
}
