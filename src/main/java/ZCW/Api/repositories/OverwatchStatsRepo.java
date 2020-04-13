package ZCW.Api.repositories;

import ZCW.Api.models.OverwatchStatsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverwatchStatsRepo extends JpaRepository<OverwatchStatsModel, Long> {
}
