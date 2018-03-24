package com.silabs.eggboard.demos.ui;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.shaders.DefaultShader;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;

/**
 * Created by james.ayvaz on 5/17/16.
 */
public class EmissiveShader extends DefaultShader {

    public EmissiveShader(Renderable renderable) {
        super(renderable);
    }

    public EmissiveShader(Renderable renderable, Config config) {
        super(renderable, config);
    }

    public EmissiveShader(Renderable renderable, Config config, String prefix) {
        super(renderable, config, prefix);
    }

    public EmissiveShader(Renderable renderable, Config config, String prefix, String vertexShader, String fragmentShader) {
        super(renderable, config, prefix, vertexShader, fragmentShader);
    }

    public EmissiveShader(Renderable renderable, Config config, ShaderProgram shaderProgram) {
        super(renderable, config, shaderProgram);
    }


    private static String defaultVertexShader = null;
    public final static String getDefaultVertexShader () {
        if (defaultVertexShader == null) {
            defaultVertexShader = Gdx.files.internal("data/default.vertex.glsl").readString();
        }
        return defaultVertexShader;
    }

    private static String defaultFragmentShader = null;
    public final static String getDefaultFragmentShader () {
        if (defaultFragmentShader == null) {
            defaultFragmentShader = Gdx.files.internal("data/default.fragment.glsl").readString();
        }
        return defaultFragmentShader;
    }
}

