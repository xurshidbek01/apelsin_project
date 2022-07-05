package com.example.lcmsapp.repository;


import com.example.lcmsapp.entity.Attachment;
import com.example.lcmsapp.entity.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, UUID> {

    AttachmentContent findByAttachment(Attachment attachment);

    AttachmentContent findByAttachment_Id(UUID id);
}
