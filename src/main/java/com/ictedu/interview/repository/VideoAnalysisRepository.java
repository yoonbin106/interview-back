package com.ictedu.interview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ictedu.interview.model.entity.VideoAnalysis;
import com.ictedu.interview.model.entity.VideoEntity;

@Repository
public interface VideoAnalysisRepository extends JpaRepository<VideoAnalysis, Long> {
    void deleteByVideo(VideoEntity video);
}