package at.drm.model;


public interface DynamicRelationModel<ObjectT> {
    ObjectT getSourceObject();

    void setSourceObject(ObjectT sourceObject);

    Long getTargetId();

    void setTargetId(Long targetId);

    String getTargetType();

    void setTargetType(String targetType);

}
