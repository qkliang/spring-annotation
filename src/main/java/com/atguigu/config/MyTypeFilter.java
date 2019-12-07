package com.atguigu.config;

import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

/**
 * @author liangqiankun
 * @date 2019Äê12ÔÂ7ÈÕ
 * 
 */
public class MyTypeFilter implements TypeFilter {

	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
			throws IOException {
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		Resource resource = metadataReader.getResource();

		String className = classMetadata.getClassName();
		System.out.println("annotationMetadata-->" + annotationMetadata);
		System.out.println("resource-->" + resource);
		System.out.println("---->" + className);
		if (className.contains("er")) {
			return true;
		}
		return false;
	}

}
