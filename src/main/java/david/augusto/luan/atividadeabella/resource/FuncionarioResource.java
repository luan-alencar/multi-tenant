package david.augusto.luan.atividadeabella.resource;

import david.augusto.luan.atividadeabella.repository.FuncionarioRepository;
import david.augusto.luan.atividadeabella.service.dto.FuncionarioDTO;
import david.augusto.luan.atividadeabella.service.mapper.FuncionarioMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/funcionarios")
public class FuncionarioResource {

    private final FuncionarioRepository repository;
    private final FuncionarioMapper mapper;

    @GetMapping(value = "listarTodos")
    public ResponseEntity<List<FuncionarioDTO>> findAll() {
        return ResponseEntity.ok(mapper.toListDTO(repository.findAll()));
    }

}
