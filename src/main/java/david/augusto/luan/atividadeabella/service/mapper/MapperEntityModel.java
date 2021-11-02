package david.augusto.luan.atividadeabella.service.mapper;

import java.util.List;

public interface MapperEntityModel<E, D> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntityList(List<D> listDTO);

    List<D> toListDTO(List<E> entityList);
}
